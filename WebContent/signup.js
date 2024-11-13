const query = 'INSERT INTO users (username, password, email) VALUES (?, ?, ?)';
db.query(query, [username, hashedPassword, email], (err, result) => {
    if (err) {
        console.error(err);
        res.status(500).send('Error registering the user');
    } else {
        res.status(201).send('User registered successfully');
    }
});