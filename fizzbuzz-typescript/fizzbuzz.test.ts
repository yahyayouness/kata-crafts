export function fizzbuzz(param: number) {
    if (param % 15 === 0) return "fizzbuzz";
    if (param % 5 === 0) return "buzz";
    if (param % 3 === 0) return "fizz";
    return param.toString();
}

describe('fizz buzz test', () => {

    it.each([3,6,9])
        ('converts mulitples of three to fizz' , (param) => {
        // given // when // then
        expect(fizzbuzz(param)).toBe("fizz");
    });
    it.each([5,10,20])
    ('converts multiples of five to buzz ' , (param) => {
        // given // when // then
        expect(fizzbuzz(param)).toBe("buzz");
    });
    it.each([15,30,45])
    ('converts multiple of three and five to fizzbuzz ' , (param) => {
        // given // when // then
        expect(fizzbuzz(param)).toBe("fizzbuzz");
    });
    it.each`
        input | output
        ${1}  | ${"1"}
        ${2}  | ${"2"}
        ${3}  | ${"fizz"}
        ${4}  | ${"4"}
        ${5}  | ${"buzz"}
        ${6}  | ${"fizz"}
        ${9}  | ${"fizz"}
        ${15}  | ${"fizzbuzz"}
        `('convert number input to be the string output' , ({input,output}) => {
        // given // when // then
        expect(fizzbuzz(input)).toBe(output);
    });
});
