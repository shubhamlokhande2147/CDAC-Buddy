
let cnt = 0;
let intervalId;

function start()
{
   intervalId = setInterval(() =>{
      cnt++;
      document.getElementById("p1").innerHTML = `${cnt}`;

   })
}

function stop()
{
    document.getElementById("ans").innerHTML = `${cnt}`
    cnt++;
}
funct