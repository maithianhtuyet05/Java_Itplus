//dk1

function kiemTraChanLe(number)
{
    if(number %2 === 0)
    {
        console.log(number + " là số chẵn");
    }
    else
    {
        console.log(number + " là số lẻ");
    }
    console.log("");
}

//dk2

function kiemTraSoNguyenDuong(number)
{
    if(number > 0 && Number.isInteger(number))
    {
        console.log(number + " là số nguyên dương");
    }
    else
    {
        console.log(number + " không phải là số nguyên dương");
    }
    console.log("");
}

//dk3

function ktNamNhuan(year)
{
    if(year % 4 === 0 && year % 100 !== 0 || (year % 400 === 0))
    {
        console.log(year + " là năm nhuận");
    }
    else
    {
        console.log(year + " không phải năm nhuận");
    }
}
