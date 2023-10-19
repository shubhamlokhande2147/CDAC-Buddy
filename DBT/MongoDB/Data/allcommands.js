k//date 18-10-2023

/* erver connect commmand-
C:\Users\shubh>mongod --dbpath="C:\MongoDBdata" --bind_ip=192.168.233.140
 
client connect command-
C:\Users\shubh>mongosh --host=192.168.209.140 --port=27017
*/


//commands-
/*
Enterprise noSQL> show databases;
Enterprise noSQL> use noSql
Enterprise noSQL> show collections;
Enterprise noSQL> db.emp.find();
Enterprise noSQL> db.moives.find();
Enterprise noSQL> db.createCollection('sample');
Enterprise noSQL> db.collection.drop('sample');

Enterprise noSQL> db.emp.distinct('job');
Enterprise noSQL> db.emp.find({},{_id:false,ename:true});
Enterprise noSQL> db.emp.find({},{_id:false,ename:true}).limit(5
Enterprise noSQL> db.emp.find({},{_id:false,ename:true}).skip(3).limit(2);

*/
//date 19-10-2023
db.book.insertOne({
    _id: 2,
    title: 'wing of fire',
    rate: {
        cost: 1200,
        currency: 'Rs'
    },
    ISBN: 'orac-122/abc',
    author: [{
        authorName: 'abc',
        email: ['abc@123', 'pqr@123']

    }, {
        authorName: 'dfgj',
        email: ['abc@123', 'pqr@123'],
        city: 'kop',
        website: 'http://abc.io'

    }]
})
//insert into book many
db.book.insertMany([
	{	
		_id:1,
		title:'MySql',
		cost:1200
	},
	{
		_id:2,
		title:'hero1',
		cost:5000
	}
	
]);

//insert into author
db.author.insertMany([
{
	_id:1,
	authorname:'Smith'
},
{
		_id:2,
		authorname:'bfdask',
		cost:1566
}
])

//join author and book

db.author.aggregate({
    $lookup: {
        from: 'book',
        localField: "_id",
        foreignField: "_id",
        as: "Book Details"
    }

})


//create table order
db.order.insertMany([{
    _id: 1,
    orderDay: 'sunday',
    customerName: 'shubham_1'
}, {
    _id: 2,
    orderDay: 'Monday',
    customerName: 'shubham_2'
}, {
    _id: 3,
    orderDay: 'saturday',
    customerName: 'shubham_3'
}])

//create orderdatails table 

db.orderDetails.insertMany([{
        oid: 1,
        productname: 'tandul',
        qty: 2,
        rate: 1500
    },
    {
        oid: 1,
        productname: 'Ghee',
        qty: 3,
        rate: 1500
    },
    {
        oid: 2,
        productname: 'Bajari',
        qty: 2,
        rate: 1500
    },
    {
        oid: 2,
        productname: 'tandul2',
        qty: 6,
        rate: 1500
    },
    {
        oid: 3,
        productname: 'tandul',
        qty: 10,
        rate: 2500
    },
    {
        oid: 3,
        productname: 'ghau',
        qty: 2,
        rate: 1500
    }
])


//join order and orderDetails table 

db.order.aggregate({
    $match: {
        _id: 1
    }
}, {
    $lookup: {
        from: 'orderDetails',
        localField: '_id',
        foreignField: 'oid',
        as: 'Order Details'
    }
})

// using functions
function f3(x){
	return db.order.aggregate({
    $match: {
        _id: x
    }
}, {
    $lookup: {
        from: 'orderDetails',
        localField: '_id',
        foreignField: 'oid',
        as: 'Order Details'
    }
})

}


// creadted app.js and load js file 
function f5(x,y,z)
{
	if(z>700)
	{
		db.book.insertOne({
			_id:x,
			title:y,
			rate:z
		})
	}
	else
	{
	   print('cost of book is <700');
	}
}

//
db.emp.find({},{
    _id: false,
    ename: true,
    salary: '$sal',
    newsalary: {
        $add: ['$sal',1000]
    }
})