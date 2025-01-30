<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nosso Dia Especial</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #fff;
            color: #333;
        }

        header {
            background: linear-gradient(90deg, #ff758c, #ff7eb3);
            color: #fff;
            text-align: center;
            padding: 40px 20px;
        }

        header h1 {
            font-size: 3rem;
            margin: 0;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            text-align: center;
        }

        .photos {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(120px, 1fr));
            gap: 15px;
            margin-top: 20px;
        }

        .photos img {
            width: 100%;
            height: auto;
            object-fit: cover;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease;
        }

        .photos img:hover {
            transform: scale(1.05);
        }

        .phrase {
            margin: 30px 0;
            font-size: 1.5rem;
            color: #555;
            font-style: italic;
        }

        .timer {
            font-size: 2rem;
            color: #ff758c;
            margin: 20px 0;
        }

        footer {
            margin-top: 40px;
            background-color: #f9f9f9;
            padding: 20px;
            text-align: center;
            color: #aaa;
            font-size: 0.9rem;
        }

        footer a {
            color: #ff758c;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header>
        <h1>Nosso Dia Especial</h1>
    </header>

    <div class="container">
        <section class="photos">
            <img src="img1.jpg" alt="Imagem 1">
            <img src="img2.jpg" alt="Imagem 2">
            <img src="img3.jpg" alt="Imagem 3">
            <img src="img4.jpg" alt="Imagem 4">
            <img src="img5.jpg" alt="Imagem 5">
        </section>

        <section class="phrase">
            <p>"Em mil vidas que eu possa viver, em cada uma delas, você será meu eterno grande amor. Não importa o tempo ou lugar, eu te amo, para sempre, em todas elas."</p>
        </section>

        <section class="timer">
            <p>Estamos juntos há <span id="timeTogether"></span></p>
        </section>
    </div>

    <footer>
        <p>Feito com ❤️ por você. <a href="#">Personalize aqui</a>.</p>
    </footer>

    <script>
        // Defina a data inicial
        const startDate = new Date('2024-12-05T00:00:00'); // Data inicial: 5 de dezembro de 2024

        function updateTime() {
            const currentDate = new Date();
            const timeDifference = currentDate - startDate;

            // Cálculos para o tempo em dias, horas, minutos e segundos
            const days = Math.floor(timeDifference / (1000 * 60 * 60 * 24));
            const hours = Math.floor((timeDifference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
            const minutes = Math.floor((timeDifference % (1000 * 60 * 60)) / (1000 * 60));
            const seconds = Math.floor((timeDifference % (1000 * 60)) / 1000);

            // Exibir no HTML
            const timeTogetherElement = document.getElementById('timeTogether');
            timeTogetherElement.textContent = `${days} dias, ${hours} horas, ${minutes} minutos e ${seconds} segundos`;
        }

        // Atualizar o tempo a cada 1 segundo
        setInterval(updateTime, 1000);
        updateTime(); // Inicializa imediatamente
    </script>
</body>
</html>
