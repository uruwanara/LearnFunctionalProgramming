object Bank extends App{

	val a1 = new account("972232475V", 2000140, 15200)
	val a2 = new account("985585475V", 2000155, 18500)
	val a3 = new account("998574512V", 2000174, 25000)
	val a4 = new account("998574512V", 2000184, -15000)
	val a5 = new account("998574512V", 2000195, -1250)
	var bank: List[account] = List(a1, a2,a3,a4,a5)
	println("ID            AccNum      Bal")
	for(element<-bank){
		println(element)
	}

	val negbal = bank.filter(x => x.balance<0)
	val bal  = bank.reduce((x, y) => x.add(y))

	val positiveBal = bank.filter(x => x.balance>0)
	val int1 = negbal.map(x => x.mul10)
	val int2 = positiveBal.map(x => x.mul5)
	bank = List.concat(int1, int2)

	println("-------------------- Accounts with  negative balance ---------")
	for(ele<-negbal){
		println(ele)
	}
	println("-------------------- Sum of all accounts --------------------- : Rs. " + (bal.balance * 100).round / 100.toDouble)
	println("-------------------- Final Balances --------------------------")
	for(element<-bank){
		println(element)
	}

}

class account(nic: String, account: Int, bal: Double){
	val id = nic
	val acc = account
	var balance = bal
	def add(r: account) = new account(this.id, this.acc, this.balance + r.balance)
	def mul10 = new account(this.id, this.acc, this.balance + this.balance * 0.1)
	def mul5 = new account(this.id, this.acc, this.balance + this.balance * 0.05)

	override def toString = s"($id, $acc, $balance)"
}
