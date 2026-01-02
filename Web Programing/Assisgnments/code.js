// for(i=0;i<=10;i++){
//     mul = 2 * i
//     document.writeln(2 +"*"+i+"="+mul+"<br>")
// }
// var num = 12345
// var temp = num
// var sum = 0

// for(let i=0;i<=5;i++){
//     var sp = parseInt(num) % 10
//     sum += sp 
//     num = num / 10
//     console.log(sp)
// }
// document.writeln(temp+" = "+sum)

// function Distance(d1){
//     var dist
//     dist= 2.54 * d1 
//     document.writeln(d1+" inch = "+ dist + " cm")
//     return dist
// }
// Distance(40);


// document.writeln("pow")
// function Power(x,y)
// {
//     var i = 0
//     var pow =1;
//     for(i=1;i<=y;i++){
//      pow = x * pow
     
//     }
//     document.writeln("Power is : "+pow)
// }
// Power(5,3);

// function aggregate(n1,n2,n3){

//     sum = (n1+n2+n3)
//     avg = sum/3
//     document.writeln("Sum of Parameter is : "+sum+"<br>"+"Average of Parameter is : "+avg)
// }
// aggregate(44,66,33)


// var n = prompt("Enter Number")
// var sqr =1
// var sum =0
//  for(i = 1; i<= n; i++){
//     if(i%2==0){
//     sqr = i * i
//      sum += sqr
//     }
//     document.writeln("hello")
//  }

// document.writeln("square is : "+sum)

// let p = document.getElementById("prin")
// let value =   p.value
// document.getElementById("output").textContent = "You entered: " + value;
    
        // for(i=1;i<=9;i++){
        //     let row =""
        //     for(j=1;j<=i;j++){
        //         row += i
        //     }

        //    console.log(row)
        // }

// function equalto()
// {
//     let num=10;
//     if(num===10)
//        console.log("True")
//     else
//          console.log("False")
// }
// equalto()

// function nameLength(names){

//     for(let i=0;i<names.length;i++){
//     if(names[i].length>4)
//         console.log(names[i])
//     }
// }
// let arr =["Joy","Meena","Anne","Xi","Veena"]  

// nameLength(arr)

function minimum(arr){
    let min =arr[0]
    for(let i=0;i<=6;i++){
        if(arr[i]< min)
          min=arr[i]
            
    }
    return min
}
let arr = [99,44,33,855,33,55,9]
console.log(minimum(arr))

function maximum(arr)
{
    let max = arr[0]
    for(let i =0;i<=6;i++){
        if(arr[i]>max)
            max = arr[i]
    }
    return max
}
console.log(maximum(arr))
function random(num){
    var ran = Math.random(parseInt().Number)
    
    if(ran==num){
        console.log("Choice correct number");
    }
    else{
        console.log("Wrong number")
    }
    return ran
}
random(55)
console.log(random(55))
