"download j8skrriqeqw66f51iyz911zyqai64j2g.zip" !
println("Data Downloaded!")

// this may take ~30 seconds depending on your internet speed
"unzip -q -o -d /resources/jupyter/labs/BD0211EN/ j8skrriqeqw66f51iyz911zyqai64j2g.zip" !
println("Data Extracted!")

// list the extracted files
"ls -1 /resources/jupyter/labs/BD0211EN/LabData" !

val readme = sc.textFile("/resources/jupyter/labs/BD0211EN/LabData/README.md")

readme.count()

readme.first()

val linesWithSpark = readme.filter(line => line.contains("Spark"))
linesWithSpark.count()

readme.filter(line => line.contains("Spark")).count()
readme.filter(line => line.contains("Spark")).count()