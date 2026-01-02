import React from 'react'
import ExpenseDate from './ExpenseDate'
function Tracker(props) {
   const items = [{
        title :"Hello Buddy" ,
        amount:"30000",
        date: new Date(2025,0,2)
    },{title :"NBye Buddy" ,
        amount:"90000",
        date: new Date(2024,0,3)}]
    return (
    <div>
        <div><p>{items[0].title}</p></div>
         <div><p>{items[0].amount}</p></div>
         <div> <ExpenseDate expDate={items[0].date} /></div>
    </div>
  )
}

export default Tracker