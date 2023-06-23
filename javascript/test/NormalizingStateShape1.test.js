const normalizeState = require("../main/NormalizingStateShape1");

describe("Normalizing State Shape #1", () => {

    test("normalizeState() function test", () => {
        const testCases = getTestCases();
        testCases.forEach(testCase => {
            expect(normalizeState(testCase.blogPost)).toEqual(testCase.expected);
        })
    })

})

function getTestCases() {
    const blogPosts1 = [
        {
            id: "post1",
            author: { username: "user1", name: "User 1" },
            body: "......",
            comments: [
                {
                    id: "comment1",
                    author: { username: "user2", name: "User 2" },
                    comment: ".....",
                },
                {
                    id: "comment2",
                    author: { username: "user3", name: "User 3" },
                    comment: ".....",
                },
            ],
        },
        {
            id: "post2",
            author: { username: "user2", name: "User 2" },
            body: "......",
            comments: [
                {
                    id: "comment3",
                    author: { username: "user3", name: "User 3" },
                    comment: ".....",
                },
                {
                    id: "comment4",
                    author: { username: "user1", name: "User 1" },
                    comment: ".....",
                },
                {
                    id: "comment5",
                    author: { username: "user3", name: "User 3" },
                    comment: ".....",
                },
            ],
        },
    ]

    const expectedState1 = {
        entities: {
            authors: {
                byId: {
                    user1: { username: "user1", name: "User 1" },
                    user2: { username: "user2", name: "User 2" },
                    user3: { username: "user3", name: "User 3" },
                },
                allIds: ["user1", "user2", "user3"],
            },
            posts: {
                byId: {
                    post1: {
                        id: "post1",
                        author: "user1",
                        body: "......",
                        comments: ["comment1", "comment2"],
                    },
                    post2: {
                        id: "post2",
                        author: "user2",
                        body: "......",
                        comments: ["comment3", "comment4", "comment5"],
                    },
                },
                allIds: ["post1", "post2"],
            },
            comments: {
                byId: {
                    comment1: {
                        id: "comment1",
                        author: "user2",
                        comment: ".....",
                    },
                    comment2: {
                        id: "comment2",
                        author: "user3",
                        comment: ".....",
                    },
                    comment3: {
                        id: "comment3",
                        author: "user3",
                        comment: ".....",
                    },
                    comment4: {
                        id: "comment4",
                        author: "user1",
                        comment: ".....",
                    },
                    comment5: {
                        id: "comment5",
                        author: "user3",
                        comment: ".....",
                    },
                },
                allIds: ["comment1", "comment2", "comment3", "comment4", "comment5"],
            },
            authorPosts: {
                byId: {
                    user1: ["post1"],
                    user2: ["post2"],
                },
                allIds: ["user1", "user2"],
            },
        },
    }

    const blogPosts2 = [
        {
            id: "post1",
            author: { username: "user1", name: "User 1" },
            body: "......",
            comments: [
                {
                    id: "comment1",
                    author: { username: "user2", name: "User 2" },
                    comment: ".....",
                },
            ],
        },
        {
            id: "post2",
            author: { username: "user2", name: "User 2" },
            body: "......",
            comments: [],
        },
        {
            id: "post3",
            author: { username: "user3", name: "User 3" },
            body: "......",
            comments: [
                {
                    id: "comment2",
                    author: { username: "user1", name: "User 1" },
                    comment: ".....",
                },
                {
                    id: "comment3",
                    author: { username: "user3", name: "User 3" },
                    comment: ".....",
                },
            ],
        },
        {
            id: "post4",
            author: { username: "user2", name: "User 2" },
            body: "......",
            comments: [],
        },
    ]

    const expectedState2 = {
        entities: {
            authors: {
                byId: {
                    user1: { username: "user1", name: "User 1" },
                    user2: { username: "user2", name: "User 2" },
                    user3: { username: "user3", name: "User 3" },
                },
                allIds: ["user1", "user2", "user3"],
            },
            posts: {
                byId: {
                    post1: {
                        id: "post1",
                        author: "user1",
                        body: "......",
                        comments: ["comment1"],
                    },
                    post2: {
                        id: "post2",
                        author: "user2",
                        body: "......",
                        comments: [],
                    },
                    post3: {
                        id: "post3",
                        author: "user3",
                        body: "......",
                        comments: ["comment2", "comment3"],
                    },
                    post4: {
                        id: "post4",
                        author: "user2",
                        body: "......",
                        comments: [],
                    },
                },
                allIds: ["post1", "post2", "post3", "post4"],
            },
            comments: {
                byId: {
                    comment1: {
                        id: "comment1",
                        author: "user2",
                        comment: ".....",
                    },
                    comment2: {
                        id: "comment2",
                        author: "user1",
                        comment: ".....",
                    },
                    comment3: {
                        id: "comment3",
                        author: "user3",
                        comment: ".....",
                    },
                },
                allIds: ["comment1", "comment2", "comment3"],
            },
            authorPosts: {
                byId: {
                    user1: ["post1"],
                    user2: ["post2", "post4"],
                    user3: ["post3"],
                },
                allIds: ["user1", "user2", "user3"],
            },
        },
    }

    return [
        { blogPost: blogPosts1, expected: expectedState1 },
        { blogPost: blogPosts2, expected: expectedState2 }
    ];
}
