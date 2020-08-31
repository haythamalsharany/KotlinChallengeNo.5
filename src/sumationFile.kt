fun main() {
    var sum=Sum(7,5)
    println(sum._result)

}
class Sum{
    var first=0;
    var second=0;
    var _result=0;
    constructor(f:Int,s:Int)
    {
        first=f;
        second=s;
        _result=f+s
    }
}