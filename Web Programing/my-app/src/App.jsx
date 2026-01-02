import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ExpenseItem from './components/Expenseitem'
import Calculator from './components/Calculator'
import SingleForm from './components/SingleForm'
import Strike from './components/Strike'
import ArrayItem from './components/ArrayItem'
import Tracker from './components/Tracker'

function App() {
 
  const expenses = [
    {
      title: 'Groceries', 
      amount: 900,
      date: new Date(),
    },
    { title: 'New TV', amount: 34000, date: new Date(2021, 2, 12) },
    { title: 'SofaSet', amount: 25000, date: new Date(2021, 2, 28),
    }
  ];

  return (
    
    <div className="App">
      <h2>Welcome to React!</h2>
      <ExpenseItem id = "100" expDate={expenses[0].date} expTitle={expenses[0].title} expAmount={expenses[0].amount}/>
      <ExpenseItem id = "101" expDate={expenses[1].date} expTitle={expenses[1].title} expAmount={expenses[1].amount}/>
      <ExpenseItem id = "102" expDate={expenses[2].date} expTitle={expenses[2].title} expAmount={expenses[2].amount}/>
      <div><Calculator/></div>
      <div><SingleForm /></div>
     <div> <Strike /> </div>
     <div><ArrayItem/></div>
     <div><Tracker/></div>
    </div>
    
    
  );
}
export default App;
