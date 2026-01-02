import { useState } from "react";

function SingleForm(){

    let [uname, setuname] = useState("")
  let unameHandler = (event)=>{
    setuname (event.target.value)
  }
  let submitHandler = (event)=>{
    event
    console.log("Hello",uname)
  }
    return(
        <div>
            <form action={submitHandler}>
                username : <input onChange={unameHandler}/><br />
                <input type="submit" value="Click Here" />
            </form>
        </div>
    )
}
export default SingleForm;