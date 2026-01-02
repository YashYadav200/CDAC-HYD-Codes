const Person = (props) =>{

    return(
        <div>
            <div><h3>{props.pname}</h3></div>
            <div><h3>{props.page}</h3></div>
            <div><h3>{props.padd}</h3></div>
        </div>
    )
}
export default Person;