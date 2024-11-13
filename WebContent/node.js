const mysql = require('mysql');

const db = mysql.createConnection({
    host: 'localhost', // Your database host
    user: 'root',      // Your database username
    password: 'yourpassword', // Your database password
    database: 'yourdatabase'  // Your database name
});

db.connect(err => {
    if (err) {
        console.error('Error connecting to the database:', err);
        return;
    }
    console.log('Connected to the database');
});