

function greet() {
    const hour = new Date().getHours();

    if (hour >= 5 && hour < 12) {
        console.log("Good Morning");
    } 
    else if (hour >= 12 && hour < 17) {
        console.log("Good Afternoon");
    } 
    else {
        console.log("Good Evening");
    }
}

module.exports = greet;
