function request(url, verbo="GET") {
    return new Promise ((resolve, reject) => {
        const req = new XMLHttpRequest();
        req.open('GET', 'https://jsonplaceholder.typicode.com/posts');
        req.onload = () => {
            if(req.status >= 400 && req.status <= 599) {
                reject({status: req.status, message: req.message});
            } else {
                resolve(req.response);
            }
        };
        req.error = () => (reject({status: null, message: "Network error"}));
        req.send();
    });
}

async function requestPosts() {
    const text = await request("https://jsonplaceholder.typicode.com/posts/");
    return JSON.parse(text);
}
async function requestUsers() {
    const text = await request("https://jsonplaceholder.typicode.com/users/");
    return JSON.parse(text);
}

function requestFullPosts() {
    return Promise.all([requestPosts(), requestUsers()])
    .then(([posts, users] => {
        const mapUsers = users.reduce((map, user) => {
        const {id, name, username, email} = user;
        map[id] = {id, name, username, email};
        return map;
    }, {});
    return posts.map(p => ({...p, user:mapUsers[p.UserId], userId: undefined}))
    });
}

requestFullPosts().then(console.log);

    
