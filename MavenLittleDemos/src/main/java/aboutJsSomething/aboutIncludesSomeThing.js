window.onload = function () {
    test();
};

function test() {
    var arr = [0,1,2,99];
    console.log(arr);
    console.log(arr.includes(9));

    var arr2 = ['0','2','9'];
    console.log(arr2);
    console.log(arr2.includes(9));

    var str = "9";
    console.log(typeof str)
}