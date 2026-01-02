import React, { useState } from 'react'
function ArrayItem(){
const [food, setFood] = useState(["Apple", "Orange", "Banana"])
    function handleAddFood (){
        const nfood = document.getElementById("foodinput").value;
        document.getElementById("foodinput").value=" ";
        setFood(f=>[...f,nfood])
    }
return (
    
    <div>
        <h1>Lis of Food</h1>
        <ul>
            {food.map((food,index)=> <li key={index}>{food}</li>)}
        </ul>
        <input type="text" name="" id="foodinput" placeholder='Enter food Name' />
        <button onClick={handleAddFood}>Addd</button>
    </div>
  )
}

export default ArrayItem;