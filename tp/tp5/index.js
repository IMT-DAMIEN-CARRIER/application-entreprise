const Sequelize = require('sequelize');

const sequelize = new Sequelize('tp5', 'root', 'root', {
    host:'localhost',
    dialect:'mariadb'/* one of 'mysql' | 'mariadb' | 'postgres' | 'mssql' */
});

sequelize
    .authenticate()
    .then(()=>{
        console.log('Connection has been established successfully.');
    })
    .catch(err=>{
        console.error('Unable to connect to the database:',err);
    });

const User = sequelize.define('uzer', {
        id: { type: Sequelize.INTEGER, autoIncrement: true, primaryKey: true },
        name: { type: Sequelize.STRING(255), allowNull: false },
        email: { type: Sequelize.STRING(255), allowNull: false },
    },
    { tableName: 'uzer', timestamps: false, underscored: true }
);

sequelize.sync({logging: console.log});

const getAllUsers = async () => {
    const users = await User.findAll();
    console.log("All users:", JSON.stringify(users, null, 2));
};

getAllUsers();

const jane = User.build({ name: "Jane", email: " mon mail" });
jane.save();