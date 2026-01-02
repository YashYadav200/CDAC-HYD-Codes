import './ExpenseItem.css';

const ExpenseItem = (props) => {
  return (
    <div className="expense-item">

      <div className="expense-item__description">
        <h2>{props.exptitle}</h2>
      </div>

      <div className="expense-item__amount">
        ₹{props.expAmount}
      </div>

    </div>
  );
}

export default ExpenseItem;
