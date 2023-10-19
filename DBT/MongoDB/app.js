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