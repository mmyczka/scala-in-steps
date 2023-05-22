sbt new scala/scalatest-example.g8
# Prompt the user to enter folder name
$folderName = Read-Host "Enter folder name"
cd $folderName
echo > readme.md
start .\readme.md