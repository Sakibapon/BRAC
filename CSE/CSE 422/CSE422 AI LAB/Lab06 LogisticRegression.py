# Abde Musavvir Khan
# 16301119

import pandas as pd
import numpy as np
from sklearn import preprocessing
import matplotlib.pyplot as plt 
plt.rc("font", size=14)
import seaborn as sns
sns.set(style="white")
sns.set(style="whitegrid", color_codes=True)

from sklearn.metrics import confusion_matrix
from sklearn.model_selection import train_test_split
from sklearn.datasets import load_iris
from sklearn.linear_model import LogisticRegression

df = pd.read_csv('Social_Network_Ads.csv')
df['Gender'] = df['Gender'].map({'Male':0, 'Female':1}) 
predictors = ['Gender', 'Age', 'EstimatedSalary']
X = df[predictors]
y = df['Purchased']

print(X)
print(y)
X_train, X_test, y_train, y_test = train_test_split(X,y,test_size=0.2)

clf = LogisticRegression(random_state=0, solver='lbfgs',multi_class='multinomial').fit(X_train, y_train)
ypred=clf.predict(X_test)
print(ypred)
yPro=clf.predict_proba(X_test) 
print(yPro)
sc=clf.score(X_test, y_test)
print(sc)

cm = confusion_matrix(y_test,ypred)

print(cm)

#ROC curve
from sklearn.metrics import roc_auc_score
from sklearn.metrics import roc_curve
logit_roc_auc = roc_auc_score(y_test, clf.predict(X_test))
fpr, tpr, thresholds = roc_curve(y_test, clf.predict_proba(X_test)[:,1])
plt.figure()
plt.plot(fpr, tpr, label='Logistic Regression (area = %0.2f)' % logit_roc_auc)
plt.plot([0, 1], [0, 1],'r--')
plt.xlim([0.0, 1.0])
plt.ylim([0.0, 1.05])
plt.xlabel('False Positive Rate')
plt.ylabel('True Positive Rate')
plt.title('Receiver operating characteristic')
plt.legend(loc="lower right")
plt.savefig('Log_ROC')
plt.show())