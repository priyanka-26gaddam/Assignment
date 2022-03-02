class Account1
{
    id:number;
    name:string;
    balance:number;

    constructor(id_new:number, name_new:string, balance_new:number) {
        this.id = id_new;
        this.name = name_new;
        this.balance = balance_new;
      }
}
   
class SavingsAccount1 extends Account1
{
    interest:number;

    constructor(id_new:number, name_new:string, balance_new:number, int:number) {
        super(id_new,name_new,balance_new);
        this.interest = int;
      }

      totalBalance():number {  
        var totalbalance = this.balance*(this.interest/100)*4;
        return totalbalance;
    } 
}

class CurrentAccount1 extends Account1
{
    interest:number;

    constructor(id_new:number, name_new:string, balance_new:number, int:number) {
        super(id_new,name_new,balance_new);
        this.interest = int;
      }

    totalBalance():number{  
        var totalbalance = this.balance*(this.interest/100)*4;
        return totalbalance;
    }
}

let saving2 = new SavingsAccount1(12,"priya",7000,7);
let current2 = new CurrentAccount1(13,"priya",90000,5);  
console.log(saving2.totalBalance());
console.log(current2.totalBalance());