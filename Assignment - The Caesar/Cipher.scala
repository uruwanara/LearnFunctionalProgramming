object Cipher extends App{
	val alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val encrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
	val decrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)
	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
  print(" Encrypted word : ")
	val en=cipher(encrypt,"Uthpala",5,alpha)
	println(en)
  print(" Decrypted word : ")
	val de=cipher(decrypt,en,5,alpha)
	println(de)
}
