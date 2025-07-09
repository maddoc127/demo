document.addEventListener("DOMContentLoaded", function () {
    const questionsContainer = document.getElementById("questions-container");
    const addQuestionBtn = document.getElementById("add-question-btn");
    const submitFormBtn = document.getElementById("submit-form-btn");

    let questionCount = 0;

    addQuestionBtn.addEventListener("click", function () {
        questionCount++;

        const questionDiv = document.createElement("div");
        questionDiv.className = "question-block";

        questionDiv.innerHTML = ` 
        <label>Soru ${questionCount}</label>
        <input type="text" placeholder="Soruyu buraya yazın" />
      `;

        questionsContainer.appendChild(questionDiv);
    });

    submitFormBtn.addEventListener("click", function () {
        const inputs = questionsContainer.querySelectorAll("input[type='text']");
        const questions = [];

        inputs.forEach(input => {
            const value = input.value.trim();
            if (value) {
                questions.push(value);
            }
        });

        fetch('/api/forms/submit', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ questions: questions }),
        })
            .then(response => {
                if (response.ok) {
                    alert("Form başarıyla gönderildi!");
                } else {
                    alert("Gönderim başarısız oldu.");
                }
            })
            .catch(error => {
                console.error("Hata:", error);
                alert("Sunucuya bağlanılamadı.");
            });
    });


});
