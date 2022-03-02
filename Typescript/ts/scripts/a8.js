class Account {
    constructor(id_new, name_new, balance_new) {
        this.id = id_new;
        this.name = name_new;
        this.balance = balance_new;
    }
}
class SavingsAccount extends Account {
    constructor(id_new, name_new, balance_new, int) {
        super(id_new, name_new, balance_new);
        this.interest = int;
    }
    totalBalance() {
        var totalbalance = this.balance * (this.interest / 100) * 4;
        return totalbalance;
    }
}
class CurrentAccount extends Account {
    constructor(id_new, name_new, balance_new, int) {
        super(id_new, name_new, balance_new);
        this.interest = int;
    }
    totalBalance() {
        var totalbalance = this.balance * (this.interest / 100) * 4;
        return totalbalance;
    }
}
let saving1 = new SavingsAccount(12, "Priy", 7000, 7);
let current1 = new CurrentAccount(13, "Priya", 90000, 5);
console.log(saving1.totalBalance());
console.log(current1.totalBalance());
//# sourceMappingURL=a8.js.map