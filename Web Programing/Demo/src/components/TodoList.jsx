import React, { useState } from 'react';

function TodoList() {
  const [items, setItems] = useState([]);
  const [name, setName] = useState('');
  const [amount, setAmount] = useState('');
  const [date, setDate] = useState('');

  const addItem = (e) => {
    e.preventDefault();
    if (!name || !amount || !date) {
      alert('Please fill in all fields');
      return;
    }
    const newItem = {
      id: Date.now(),
      name,
      amount: parseFloat(amount),
      date: new Date(date)
    };
    setItems([...items, newItem]);
    setName('');
    setAmount('');
    setDate('');
  };

  const deleteItem = (id) => {
    setItems(items.filter(item => item.id !== id));
  };

  const formatDate = (date) => {
    const d = new Date(date);
    return d.toLocaleDateString();
  };

  return (
    <div>
      <h2>Todo List</h2>
      <form onSubmit={addItem}>
        <input
          type="text"
          placeholder="Name"
          value={name}
          onChange={e => setName(e.target.value)}
        />
        <input
          type="number"
          placeholder="Amount"
          value={amount}
          onChange={e => setAmount(e.target.value)}
        />
        <input
          type="date"
          value={date}
          onChange={e => setDate(e.target.value)}
        />
        <button type="submit">Add</button>
      </form>
      <ul>
        {items.map(item => (
          <li key={item.id}>
            <span>{item.name} - Rs {item.amount.toFixed(2)} - {formatDate(item.date)}</span>
            <button onClick={() => deleteItem(item.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TodoList;
