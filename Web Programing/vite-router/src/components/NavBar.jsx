import React from 'react'
import { NavLink } from 'react-router-dom'

function NavBar() {
  return (
    <div>
        <ul>
            <li>
                <NavLink to = "/">Home</NavLink>
                <NavLink to = "/About">About</NavLink>
                <NavLink to = "/Blog">Blog</NavLink>
            </li>
        </ul>
    </div>
  )
}

export default NavBar