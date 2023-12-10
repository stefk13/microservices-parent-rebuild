//log the start of the script execution
print('START');

//switch to the 'pproduct-service' database (or create it if it doesn't exist)
db = db.getSiblingDB('product-service');

db.createUser(
    {
        user: 'rootadmin',
        pwd: 'password',
        roles: [{ role: 'readWrite', db: 'product-service' }],
    }
)

// create a new collection named 'user' within the 'product-service' database
db.createCollection('user')

// log the end of the script execution
print('END');