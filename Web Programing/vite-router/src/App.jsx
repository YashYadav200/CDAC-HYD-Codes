import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import NavBar from './components/NavBar'
import { Route, Routes } from 'react-router-dom'
import Home from './components/Home'
import Blogs from './components/Blogs'
import About from './components/About'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <NavBar/>
      <Routes>
        <Route path="/" element = {<Home/>}/>
        <Route path="/About" element = {<About/>}/>
        <Route path="/Blog" element = {<Blogs/>}/>
      </Routes>
    </div>
  )
}

export default App
