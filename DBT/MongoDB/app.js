/* function f3(x) {
    return db.order.aggregate([{
        $match: {
            _id: x
        }
    }, {
        $lookup: {
            from: 'orderDetails',
            localField: '_id',
            foreignField: "oid",
            as: "Order Details"
        }
    }])
}

function f4() { 
	db.dept.find().forEach( function(x) {
	print(x.dname, x.location);
	})
}



function f5(x, y, z) { 
	if (z >= 700) {
		db.book.insertOne({
			_id:x,
			title:y,
			cost:z
	});
		print("Document inserted...");
	}
	else {
			print ("Cost of book is <700 ....");
	}

}

*/

function f6() { 
	db.dept.find().forEach( function(x) {
	db.dept1.insertOne(x);
	})
}















































