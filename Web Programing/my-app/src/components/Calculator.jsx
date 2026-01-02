import { useState } from "react"

function Calculator(){
   // let count = 0
   let [count, setcount] = useState(0)  // let arr = [] then array theae not arraY LINE I AM DONIG THAT ONE
   //setCOUNT 2 ND ARG ALEWAY FUNCTION
    let btnHandler = () =>{
       setcount(count + 1)             // ++ -- not support
        count++
        console.log("Button Clicked"+count)
    }
    return(
    <div>
        <h2>The Counter is  :{count}</h2>
        <button onClick={btnHandler}>Count</button>
    </div>
    )
}
export default Calculator;