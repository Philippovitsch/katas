// Source: https://www.codewars.com/kata/648365a0e4e521001c5c829d

function normalizeState(blogPosts) {
    const normalizedAuthors = getNormalizedAuthors(blogPosts);
    const normalizedPosts = getNormalizedPosts(blogPosts);
    const normalizedComments = getNormalizedComments(blogPosts);
    const normalizedAuthorPosts = getNormalizedAuthorPosts(blogPosts);
    const authorIds = getAuthorIds(blogPosts);
    const postIds = getPostIds(blogPosts);
    const commentIds = getCommentIds(blogPosts);
    const authorPostIds = getAuthorPostIds(blogPosts);
    return {
        entities: {
            authors: {
                byId: normalizedAuthors,
                allIds: authorIds
            },
            posts: {
                byId: normalizedPosts,
                allIds: postIds
            },
            comments: {
                byId: normalizedComments,
                allIds: commentIds
            },
            authorPosts: {
                byId: normalizedAuthorPosts,
                allIds: authorPostIds
            }
        }
    };
}

function getNormalizedAuthors(blogPosts) {
    const postAuthors = blogPosts.map(post => post.author);
    const commentAuthors = blogPosts.map(post => post.comments).flat().map(comment => comment.author);
    return [...postAuthors, ...commentAuthors]
        .reduce((data, item) => {
            data[item.username] = item;
            return data;
        }, {});
}

function getNormalizedPosts(blogPosts) {
    return blogPosts
        .map(post => ({
            ...post,
            comments: post.comments.map(comment => comment.id),
            author: post.author.username
        }))
        .reduce((data, item) => {
            data[item.id] = item;
            return data;
        }, {});
}

function getNormalizedComments(blogPosts) {
    return blogPosts
        .map(post => post.comments)
        .flat()
        .map(comment => ({
            ...comment,
            author: comment.author.username
        }))
        .reduce((data, item) => {
            data[item.id] = item;
            return data;
        }, {});
}

function getNormalizedAuthorPosts(blogPosts) {
    return blogPosts
        .map(post => ({
            id: post.id,
            author: post.author.username
        }))
        .reduce((data, item) => {
            data[item.author] = data[item.author] ? [...data[item.author], item.id] : [item.id];
            return data;
        }, {});
}

function getAuthorIds(blogPosts) {
    const authors = blogPosts
        .map(post => {
            const postAuthor = post.author.username;
            const commentAuthors = post.comments.map(comment => comment.author.username);
            return [postAuthor, ...commentAuthors];
        })
        .flat();
    return [...new Set(authors)];
}

function getPostIds(blogPosts) {
    return blogPosts.map(post => post.id);
}

function getCommentIds(blogPosts) {
    return blogPosts.map(post => post.comments).flat().map(comment => comment.id);
}

function getAuthorPostIds(blogPosts) {
    return [...new Set(blogPosts.map(post => post.author.username))];
}

module.exports = normalizeState;
