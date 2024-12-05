<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nature Videos by Category</title>
Expand
message.txt
9 KB
﻿
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nature Videos by Category</title>
    <style>
        /* Color variables */
        :root {
            --text-color: #ffffff;
            --nav-background: #333333;
            --main-background: #ffffff;
            --video-background: #f0f0f0;
            --main-text-color: #000000;
        }

        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            color: var(--main-text-color);
        }

        /* Mobile menu button */
        .menu-toggle {
            display: none;
            position: fixed;
            top: 10px;
            left: 10px;
            z-index: 1000;
            background: var(--nav-background);
            color: var(--text-color);
            border: none;
            padding: 10px;
            cursor: pointer;
        }

        nav {
            background-color: var(--nav-background);
            padding: 1rem;
            position: fixed;
            width: 200px;
            height: 100vh;
            color: var(--text-color);
            transition: transform 0.3s ease;
        }

        .logo {
            font-size: 24px;
            margin-bottom: 2rem;
        }

        .logo a {
            color: var(--text-color);
            text-decoration: none;
        }

        nav ul {
            list-style-type: none;
            padding: 0;
        }

        nav li {
            margin-bottom: 1rem;
        }

        nav a {
            color: var(--text-color);
            text-decoration: none;
            cursor: pointer;
        }

        main {
            margin-left: 220px;
            padding: 1rem;
            background-color: var(--main-background);
            min-height: 100vh;
        }

        .category-section {
            display: none;
        }

        .category-section.active {
            display: block;
        }

        .video-container {
            max-width: 800px;
            margin: 0 auto 2rem;
        }

        .video-wrapper {
            position: relative;
            padding-bottom: 56.25%;
            height: 0;
            overflow: hidden;
            background-color: var(--video-background);
        }

        .video-wrapper iframe, .video-wrapper img {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
        }

        .thumbnail-nav {
            display: flex;
            justify-content: center;
            margin-top: 1rem;
            gap: 0.5rem;
            flex-wrap: wrap;
        }

        .thumbnail {
            width: 50px;
            height: 50px;
            background-color: #ddd;
            cursor: pointer;
        }

        /* Responsive design */
        @media screen and (max-width: 768px) {
            .menu-toggle {
                display: block;
            }

            nav {
                transform: translateX(-100%);
                z-index: 999;
            }

            nav.active {
                transform: translateX(0);
            }

            main {
                margin-left: 0;
                padding-top: 60px;
            }

            .video-container {
                padding: 0 10px;
            }

            h1 {
                font-size: 24px;
                text-align: center;
            }

            .thumbnail {
                width: 40px;
                height: 40px;
            }
        }

        /* Medium screens */
        @media screen and (min-width: 769px) and (max-width: 1024px) {
            nav {
                width: 160px;
            }

            main {
                margin-left: 180px;
            }

            .video-container {
                max-width: 600px;
            }
        }
    </style>
</head>
<body>
    <button class="menu-toggle" onclick="toggleMenu()">☰ Menu</button>
    
    <nav id="sidebar">
        <div class="logo">
            <a href="index.html">Home</a>
        </div>
        <ul>
            <li><a onclick="showCategory('lake')">Lake</a></li>
            <li><a onclick="showCategory('water')">Water</a></li>
            <li><a onclick="showCategory('forest')">Forest</a></li>
            <li><a onclick="showCategory('building')">Building</a></li>
        </ul>
    </nav>
    
    <main>
        <!-- Lake Section -->
        <section id="lake" class="category-section">
            <div class="video-container">
                <h1>Lake Videos</h1>
                <div class="video-wrapper">
                    <img src="/api/placeholder/800/450" alt="Lake video placeholder">
                </div>
                <div class="thumbnail-nav">
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                </div>
            </div>
        </section>

        <!-- Water Section -->
        <section id="water" class="category-section">
            <div class="video-container">
                <h1>Water Videos</h1>
                <div class="video-wrapper">
                    <img src="/api/placeholder/800/450" alt="Water video placeholder">
                </div>
                <div class="thumbnail-nav">
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                </div>
            </div>
        </section>

        <!-- Forest Section -->
        <section id="forest" class="category-section">
            <div class="video-container">
                <h1>Forest Videos</h1>
                <div class="video-wrapper">
                    <img src="/api/placeholder/800/450" alt="Forest video placeholder">
                </div>
                <div class="thumbnail-nav">
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                </div>
            </div>
        </section>

        <!-- Building Section -->
        <section id="building" class="category-section">
            <div class="video-container">
                <h1>Building Videos</h1>
                <div class="video-wrapper">
                    <img src="/api/placeholder/800/450" alt="Building video placeholder">
                </div>
                <div class="thumbnail-nav">
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                    <div class="thumbnail"></div>
                </div>
            </div>
        </section>
    </main>

    <script>
        function showCategory(categoryId) {
            document.querySelectorAll('.category-section').forEach(section => {
                section.classList.remove('active');
            });
            document.getElementById(categoryId).classList.add('active');
            
            // If on mobile, close the menu after selecting a category
            if (window.innerWidth <= 768) {
                toggleMenu();
            }
        }

        function toggleMenu() {
            const sidebar = document.getElementById('sidebar');
            sidebar.classList.toggle('active');
        }

        // Show lake category by default
        showCategory('lake');

        // Close menu when clicking outside on mobile
        document.addEventListener('click', function(event) {
            const sidebar = document.getElementById('sidebar');
            const menuToggle = document.querySelector('.menu-toggle');
            
            if (window.innerWidth <= 768 && 
                !sidebar.contains(event.target) && 
                !menuToggle.contains(event.target) &&
                sidebar.classList.contains('active')) {
                toggleMenu();
            }
        });
    </script>
</body>
</html>
message.txt
9 KB
