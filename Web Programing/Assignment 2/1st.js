function min(arr) {
    
    let minimum = arr[0];

    
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < minimum) {
            minimum = arr[i];  
        }
    }
    return minimum;
}

let numbers = [100,99,65,44,9,88];
console.log(min(numbers));  

