export default function MathsPassPara(props){
      
let n1 = props.num1;
let n2 = props.num2;
let result;
let op = props.op;
switch(op)
{
    case "+":
        result=n1+n2;
        break;
    case "-":
        result=n1-n2;
        break;
    case "*":
        result = n1*n2;
        break;
    case "/":
        result = n1/n2;
        break;
    default:
        result=NaN;
}   
    return(

        <>
         <p> {n1} {op} {n2} = {result} </p> 
        </>

    )
}