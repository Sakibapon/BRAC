#Abde Musavvir Khan
#16301119
import pandas as pd
import sklearn as sk
from pandas import read_csv
from sklearn import tree
import numpy as np

data = read_csv("data.csv")

data.head(5)
data['Color'] = data['Color'].map({'Red': 0, 'Blue': 1})
data['Brand'] = data['Brand'].map({'Snickers': 0, 'Kit Kat': 1})
predictors=['Color','Brand']


x=data[predictors]
y=data.Class
decisionTreeClassifier = tree.DecisionTreeClassifier(criterion="entropy")
dTree = decisionTreeClassifier.fit(x, y)
dotData = tree.export_graphviz(dTree, out_file=None)
print(dotData)
print(dTree.predict([[1, 1]]))
print(dTree.predict([[0, 0]]))


Taste=['Sweet','Bitter']
data["Taste"]=np.random.choice(list(Taste),len(data))

data.head(5)
data['Taste'] = data['Taste'].map({'Sweet': 1, 'Bitter': 0})

data.head(5)
predictors=['Color','Brand','Taste']
x=data[predictors]
y=data.Class
decisionTreeClassifier = tree.DecisionTreeClassifier(criterion="entropy")
dTree = decisionTreeClassifier.fit(x, y)
dotData = tree.export_graphviz(dTree, out_file=None)
print(dotData)
print(dTree.predict([[1, 1,1]]))
print(dTree.predict([[0, 0,0]]))
print(dTree.predict([[1,0, 0]]))
print(dTree.predict([[1,1, 0]]))
print(dTree.predict([[1,0, 1]]))
print(dTree.predict([[0,0, 1]]))
print(dTree.predict([[0,1, 0]]))
