
student_scores = {
  "Harry": 81,
  "Ron": 78,
  "Hermione": 99, 
  "Draco": 74,
  "Neville": 62,
}

student_grades={}

for student in student_scores:
    score = student_scores[student]
    if score >90:
        student_grades[student]='outstanding'
    elif score >80:
        student_grades[student]='Exceed Expentations'
    elif score >71:
        student_grades[student]='Acceptable'
    else:
        student_grades[student]='Fail'


print(student_grades)