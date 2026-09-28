<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.rc.model.Player" %>

<!DOCTYPE html>

<html>

<head>


<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Admin Dashboard | Player Management</title>

<link rel="stylesheet" href="admin.css">


</head>

<body>
 
 

<!-- ================= SIDEBAR ================= -->

<aside class="sidebar">

    <div class="logo-section">

        <div class="logo-icon">
            PM
        </div>

        <div>
            <h2>Player Management</h2>
            <span>Admin Portal</span>
        </div>

    </div>


    <nav class="sidebar-menu">

        <p class="menu-title">
            MAIN MENU
        </p>

        <a href="#" class="menu-item active">

            <span class="menu-icon">⌂</span>

            Dashboard

        </a>


        <a href="allPlayers" class="menu-item">

            <span class="menu-icon">👥</span>

            All Players

        </a>


        <a href="addPlayer.jsp" class="menu-item">

            <span class="menu-icon">＋</span>

            Add Player

        </a>


        <p class="menu-title">
            MANAGEMENT
        </p>


        <a href="#" class="menu-item">

            <span class="menu-icon">📊</span>

            Reports

        </a>


        <a href="#" class="menu-item">

            <span class="menu-icon">⚙</span>

            Settings

        </a>

    </nav>


    <div class="sidebar-bottom">

        <a href="logout" class="logout">

            <span class="menu-icon">↪</span>

            Logout

        </a>

    </div>

</aside>



<!-- ================= MAIN AREA ================= -->

<main class="main">

    <!-- ================= TOP HEADER ================= -->

    <header class="header">


        <div class="header-left">

            <button class="menu-button">
                ☰
            </button>

            <div>

                <h3>
                    Dashboard
                </h3>

                <p>
                    Player Management System
                </p>

            </div>

        </div>



        <div class="header-right">


            <button class="notification">

                🔔

                <span class="notification-count">
                    3
                </span>

            </button>


            <div class="profile">

                <div class="profile-avatar">
                    A
                </div>

                <div class="profile-info">

                    <strong>
                        Admin
                    </strong>

                    <span>
                        Administrator
                    </span>

                </div>

            </div>

        </div>

    </header>



    <!-- ================= CONTENT ================= -->

    <section class="content">


        <!-- Welcome -->

        <div class="welcome">

            <div>

                <h1>
                    Welcome back, Admin 👋
                </h1>

                <p>
                    Here's what's happening with your player management system today.
                </p>

            </div>


            <a href="addPlayer.jsp" class="primary-button">
                + Add New Player
            </a>

        </div>



        <!-- ================= STATISTICS ================= -->

        <div class="stats">


            <div class="stat-card">

                <div class="stat-icon blue">
                    👥
                </div>

                <div class="stat-details">

                    <span>
                        Total Players
                    </span>

                    <h2>
                        248
                    </h2>

                    <small class="positive">
                        ↑ 12% from last month
                    </small>

                </div>

            </div>



            <div class="stat-card">

                <div class="stat-icon green">
                    ✓
                </div>

                <div class="stat-details">

                    <span>
                        Active Players
                    </span>

                    <h2>
                        218
                    </h2>

                    <small class="positive">
                        ↑ 8% from last month
                    </small>

                </div>

            </div>



            <div class="stat-card">

                <div class="stat-icon orange">
                    +
                </div>

                <div class="stat-details">

                    <span>
                        New Players
                    </span>

                    <h2>
                        24
                    </h2>

                    <small class="positive">
                        ↑ 5% this month
                    </small>

                </div>

            </div>



            <div class="stat-card">

                <div class="stat-icon purple">
                    ⚡
                </div>

                <div class="stat-details">

                    <span>
                        Total Activities
                    </span>

                    <h2>
                        1,284
                    </h2>

                    <small>
                        Updated today
                    </small>

                </div>

            </div>


        </div>



        <!-- ================= QUICK ACTIONS ================= -->

        <div class="section-heading">

            <div>

                <h2>
                    Quick Actions
                </h2>

                <p>
                    Frequently used management actions
                </p>

            </div>

        </div>


        <div class="quick-actions">


            <a href="allPlayers" class="action-card">

                <div class="action-icon blue">
                    👥
                </div>

                <div>

                    <h3>
                        View Players
                    </h3>

                    <p>
                        Browse and manage all players
                    </p>

                </div>

                <span class="arrow">
                    →
                </span>

            </a>



            <a href="addPlayer.jsp" class="action-card">

                <div class="action-icon green">
                    ＋
                </div>

                <div>

                    <h3>
                        Add Player
                    </h3>

                    <p>
                        Register a new player
                    </p>

                </div>

                <span class="arrow">
                    →
                </span>

            </a>



            <a href="#" class="action-card">

                <div class="action-icon purple">
                    📊
                </div>

                <div>

                    <h3>
                        View Reports
                    </h3>

                    <p>
                        Check system reports
                    </p>

                </div>

                <span class="arrow">
                    →
                </span>

            </a>


        </div>



        <!-- ================= BOTTOM SECTION ================= -->

        <div class="bottom-grid">


            <!-- Recent Players -->

            <div class="panel">

                <div class="panel-header">

                    <div>

                        <h2>
                            Recent Players
                        </h2>

                        <p>
                            Recently registered players
                        </p>

                    </div>

                    <a href="allPlayers">
                        View All
                    </a>

                </div>


                <div class="table-container">

                    <table>

                        <thead>

                            <tr>

                                <th>
                                    Player
                                </th>

                                <th>
                                    Email
                                </th>

                                <th>
                                    Status
                                </th>

                                <th>
                                    Action
                                </th>

                            </tr>

                        </thead>


                        <tbody>

                            <tr>

                                <td>

                                    <div class="player">

                                        <div class="player-avatar">
                                            R
                                        </div>

                                        <span>
                                            Rahul
                                        </span>

                                    </div>

                                </td>

                                <td>
                                    rahul@example.com
                                </td>

                                <td>
                                    <span class="status active-status">
                                        Active
                                    </span>
                                </td>

                                <td>
                                    <a href="allPlayers" class="view-button">
                                        View
                                    </a>
                                </td>

                            </tr>


                            <tr>

                                <td>

                                    <div class="player">

                                        <div class="player-avatar">
                                            S
                                        </div>

                                        <span>
                                            Siddhu
                                        </span>

                                    </div>

                                </td>

                                <td>
                                    siddhu@example.com
                                </td>

                                <td>
                                    <span class="status active-status">
                                        Active
                                    </span>
                                </td>

                                <td>
                                    <a href="allPlayers" class="view-button">
                                        View
                                    </a>
                                </td>

                            </tr>


                            <tr>

                                <td>

                                    <div class="player">

                                        <div class="player-avatar">
                                            V
                                        </div>

                                        <span>
                                            Vikram
                                        </span>

                                    </div>

                                </td>

                                <td>
                                    vikram@example.com
                                </td>

