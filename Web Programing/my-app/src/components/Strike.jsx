import React, { useState } from 'react'
import "./Strike.css"
function Strike() {
    
    const [count, setCount]=useState(0)

    const strikeHandler = () => {
    setCount (count  + 1) 

    }
    const [name, setName] = useState("Yash")
    const nameHandler =() => {
        setName (" yadav");
        
    }
    const [name1,setName1] = useState()
    const enterName = (e) =>{
        setName1(e.target.value)
    }
    return (
    <div className="container">
      <h2>React State Practice</h2>

      <p>CounterStrikes : {count}</p>
      <button onClick={strikeHandler}>SetCount</button>

      <br/><br/>

      Enter Text:
      <input type="text" onChange={enterName} />

      <p>Text Entered : {name1}</p>

      <p>PreviousName: {name}</p>
      <button onClick={nameHandler}>Change Name</button>
    </div>
  )
}

export default Strike;