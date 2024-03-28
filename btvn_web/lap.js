var n = prompt("Nhập một số nguyên dương:");
n = parseInt(n);

///l1
if(isNaN(n) || n<= 0 || !Number.isInteger(n))
{
    console.log("Nhập số hợp lệ!");
}
else
{
    var sum =0;
    for (var i = 1; i<=n; i++)
    {
        sum+= i;
    }
    console.log("Tổng các số từ 1 đến " + n + " là: " + sum);
    console.log("");
}

//l2
if(isNaN(n) || n<= 0 || !Number.isInteger(n))
{
    console.log("Nhập số hợp lệ!");
}
else
{
    var factorial = 1;
    var i = 1;

    while (i <= n) {
        factorial *= i;
        i++;
    }
    console.log(n + "! = " +factorial);
    console.log("");
}

//l3

for (var i = 2; i<=9; i++)
{
    console.log("Bảng cửu chương " + i + ":");
    for (var j = 1; j<=10; j++)
    {
        console.log(i + " x " + j + " = " + (i*j));
    }
    console.log("");
}