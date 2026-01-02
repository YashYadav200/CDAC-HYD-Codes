const ExpenseItem = (props) => {
    const btnhandler = ()=>{
    
  }
    return (
        <div className="expense-item">
            <div>{props.expDate.toISOString()}</div>
            <div className="expense-item__description">
                <h2>{props.expTitle}</h2></div>
                <div>
                <p className="expense-item__price">Rs {props.expAmount}</p>
            </div>
            <button onClick={btnhandler}>change title</button>
        </div>
    )
}
export default ExpenseItem;
