let obj = {productName:"Maggi",cost:"20"}
let product = obj.productName
let cost = obj.cost
console.log(product," --> ",cost);

let{productName:a,cost:b} = obj;
console.log(a,"--->",b);

let arr = [10,20,3,0,45,60]
let [,,x,y] = arr
console.log(x,y);