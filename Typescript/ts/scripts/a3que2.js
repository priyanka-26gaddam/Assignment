class Account1 {
    constructor(id_new, name_new, balance_new) {
        this.id = id_new;
        this.name = name_new;
        this.balance = balance_new;
    }
}
class SavingsAccount1 extends Account1 {
    constructor(id_new, name_new, balance_new, int) {
        super(id_new, name_new, balance_new);
        this.interest = int;
    }
    totalBalance() {
        var totalbalance = this.balance * (this.interest / 100) * 4;
        return totalbalance;
    }
}
class CurrentAccount1 extends Account1 {
    constructor(id_new, name_new, balance_new, int) {
        super(id_new, name_new, balance_new);
        this.interest = int;
    }
    totalBalance() {
        var totalbalance = this.balance * (this.interest / 100) * 4;
        return totalbalance;
    }
}
let saving2 = new SavingsAccount1(12, "priya", 7000, 7);
let current2 = new CurrentAccount1(13, "priya", 90000, 5);
console.log(saving2.totalBalance());
console.log(current2.totalBalance());
//# sourceMappingURL=a3que2.js.map