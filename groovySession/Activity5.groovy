package groovySession

class Activity5 {

		static void main(args) {

			def List = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]

			def strList = List.minus([11, 2, 19, 5])

			def intList = List.minus(["Mango", "Apple", "Watermelon"])

			println "Sorted String list: ${strList.sort()}"
			println "Sorted Integer list: ${intList.sort()}"
		}

}
