/**
 * js var一个变量可以直接点他的属性
 * 在其他地方修改
 */

function test()
{
    var GG;
    GG.isShow = true;
    if (GG.isShow)
    {
        console.log("ggg")
    }
}