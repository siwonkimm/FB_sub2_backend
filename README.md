# 📖 How Naming Becomes Discourse: An Integrated Analysis of News Framing and Comment Discourse Surrounding 'Generation MZ'

> **'Frame Breaker' Team Project**
> **Project Period**: Jun 29, 2026 – Jul 27, 2026

---

## 📌 1. Project Overview

### 1.1 Problem Statement: "Naming Shapes the Direction of Interpretation"

The designation 'Generation MZ' lumps heterogeneous individuals spanning a age gap of over 20 years into a single, homogeneous group. Media and corporations, out of accustomed practice, have erased internal diversity by framing them as "objects of management," "marketing targets," or a "group with specific tastes."

Focusing on the **structural violence that arises when such unintentional and conventional framing is unconsciously repeated**, this project conducts a Critical Discourse Analysis (CDA) integrating the news framing process, responses in the Naver News comment public sphere, and vocabulary co-occurrence patterns within the semantic space.

---

## 🏗️ 2. Overall Project Structure

This project consists of a main analysis, two sub-projects, and a comprehensive discussion.

**Main Project** 
News Framing Analysis of 'Generation MZ' (AI-based full population analysis, heterogeneous model cross-validation, and human verification)

**Sub-project 1** 
AI Labeling of Comment Discourse (2020 vs. 2022) & Word2Vec/PMI Semantic Space Analysis Tool Development

**Sub-project 2** 
Data Cross-Verification & Data Sharing Platform **'VeriData Hub'** Construction

**Comprehensive Discussion** 
Comparison of Frame Distributions between News Framing and Comment Discourse & Discussion on the Possibility of 'Frame Labor Division'

---

## 🌐 3. Sub-project 2: Data Cross-Verification & Sharing Platform `VeriData Hub`

> **Domain**: [antikimchunsu.duckdns.org](https://www.google.com/search?q=http://antikimchunsu.duckdns.org)

### 3.1 Project Introduction & Philosophy

Sub-project 2 was responsible for building a platform to **centrally manage, share, view, and verify raw crawled data, AI/human-labeled datasets, and reliability verification pipeline outputs (CSVs)** produced throughout this analysis.

* **Meaning of the Domain Name 'anti-Kimchunsu'**:
It acts as an anti-thesis to the positive view of naming in poet Kim Chun-su's poem *"Flower"* (*"When I called his name, he came to me and became a flower"*). It represents the core problem statement of this project: **while the act of naming can turn an object into a 'flower,' it can also function as an exercise of power that confines and traps 'the other' into a single rigid frame.**

### 3.2 Key Features

1. **Centralization & Open Access to Analysis Artifacts (CSV/Data)**
* Provides all raw data and intermediate outputs, including the news article dataset (8,156 cases), comment datasets (2020 / 2022), and PMI vocabulary analysis results.


2. **Data Cross-Verification & Ensuring Reproducibility**
* Delivers an interface for research participants and external verifiers to browse datasets and cross-check labeling results (AI labels vs. Human labels).
* Maximizes transparency and reproducibility of the analysis process through open data practices.


3. **Data Exchange & Interactive Community**
* Functions as a communication space to gather feedback on research outputs among team members and project researchers.



### 3.3 Architecture & Backend

* **Backend Development**: Built data upload/download functionalities and cross-verification data mapping APIs.
* **Domain & Infrastructure**: Configured a custom domain integration via DuckDNS and operated the Data Hub server (`antikimchunsu.duckdns.org`).

---

## 📊 4. Summary of Key Findings

1. **News Frame (Part I)**: Among articles containing frames (17.1%), Othering (59.3%) and Generalization (39.9%) accounted for the overwhelming majority, while direct moral condemnation or deficiency frames were absent.
2. **Shift in Comment Discourse (Part II)**: In the comment public sphere, the proportion of generational discourse increased 2.6-fold in 2022 compared to 2020 (3.9% → 10.3%), with the main axis of discourse rapidly shifting from 'Generalization' to 'Individual Choice / Moral Condemnation (50.7%)'.
3. **Semantic Space Analysis (Part III)**: PMI co-occurrence analysis revealed 'bug' (벌레) ($G^2=32.71$) as the top vocabulary significantly co-occurring with 'MZ', confirming a strong coupling with derogatory and hate expressions in the comment public sphere.
4. **Possibility of Frame Labor Division (Part V)**: Confirmed the exploratory possibility of a 'frame labor division structure', where news outlets supply Othering/Generalization frames, and the comment public sphere consumes them in the form of moral condemnation and hate discourse.

---

> This narrative is based on Sub-project 2.
