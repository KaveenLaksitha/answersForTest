function calculatePower(base, exp) {
    let answer = 1;

    for (let i = 0; i < exp; i++) {
        answer = answer * base;
    }
    return answer;
}

let base = 2
let exp = 3
let output = calculatePower(base, exp);

console.log("answer is ", output)
