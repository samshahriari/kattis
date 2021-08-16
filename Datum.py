import datetime

datum = input();
manad, dag = datum.split(" ")

date = datetime.datetime(2009, int(dag), int(manad))
print(date.strftime("%A")) 