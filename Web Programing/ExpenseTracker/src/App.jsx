import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ExpenseTracker from './components/ExpenseTracker'
import ExpenseItem from './components/ExpenseItem'
import Person from './components/Person'
function App() {
  const [count, setCount] = useState(0)
  const expense =[{title: 'Myntra Shoping' ,Amount:'30000', date: new Date(2020, 7, 14)},{title: 'Electronics Gadgets' ,Amount:'700000', date: new Date(2023, 9, 14)},{title: 'Amazon Shoping' ,Amount:'90000', date: new Date(2025, 4, 4)}]

  const detail = [
    {name: "Yash" ,Age:"22",Address:'Akola,Maharastra'},
   { name: "Arav",Age:"26",Address:"Pune,Maharastra"},
   { name: "Radha",Age:"21",Address:"Vrindavan,UP"},
  {  name: "Raj",Age:"25",Address:"Telengana,Hydrabad"},

  ]
  return (
     <div className="App">
     <ExpenseItem exptitle={expense[0].title} expAmount={expense[0].Amount }expDate={expense[0].date} />
     <ExpenseItem exptitle={expense[1].title} expAmount={expense[1].Amount }expDate={expense[1].date} />
     <ExpenseItem exptitle={expense[2].title} expAmount={expense[2].Amount }expDate={expense[2].date} />

     <Person pname={detail[0].name} page={detail[0].Age} padd={detail[0].Address}/>
     
     <Person pname={detail[1].name} page={detail[1].Age} padd={detail[1].Address}/>
     
     <Person pname={detail[2].name} page={detail[2].Age} padd={detail[2].Address}/>
    
    <Person pname={detail[3].name} page={detail[3].Age} padd={detail[3].Address}/>    
    </div>
  );

}

export default App
