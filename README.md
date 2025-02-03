# PickMyMenu

![PickMyMenu](https://github.com/user-attachments/assets/b9e93ee1-1883-42f3-9b76-48974de02a1c)


## 📌 프로젝트 개요
<h3>AI를 활용하여 사용자가 선택한 조건에 맞는 점심/저녁 메뉴를 추천해주는 웹 애플리케이션</h3>

- **배포 링크** : [PickMyMenu](https://hhjnn92.synology.me:7061)

<br>

## 👨‍👩‍👦‍👦 팀원
<br>

|  이름  |  김태수  |  차성환  |  최현우  |
|--------|--------|--------|--------|
| 깃허브 | [taisooqq](https://github.com/taisooqq) | [zhffk0379](https://github.com/zhffk0379) | [Cnowcow](https://github.com/Cnowcow) |

<br>

## 📆 개발 기간
2025.01.01 ~ 2025.02.10 (1개월)

<br>

## 🛠 기술 스택
Java / Python / React / Spring Boot / Spring Data JPA / Spring Security / Gradle / RESTful API / FastAPI / BeautifulSoup (크롤링) / MySQL / Docker / GitHub Actions / CI/CD / Gemini API / KakaoMap API

<br>

## 🧑‍💻 아키텍쳐

<br>

## 🔗 ERD

![ERD](https://github.com/user-attachments/assets/7e16aad2-c2cc-4ae9-8d4d-bf47ac1a33db)

<br>

## 🚀 주요 기능

### 1. AI 기반 메뉴 추천 기능 구현 (Spring Boot (RESTful API), Python (FastAPI), Gemini API)
- 클라이언트가 선택한 조건을 바탕으로 Gemini 모델을 통해 AI 기반의 메뉴를 추천하고, <br> 이를 클라이언트에게 제공하는 기능 개발
  
### 2. 데이터 크롤링 후 필터링 및 Gemini API 처리 기능 구현
- 클라이언트가 입력한 키워드를 바탕으로 네이버 블로그 검색을 수행하고, BeautifulSoup을 <br> 활용하여 데이터 크롤링

- 크롤링된 데이터를 필터링하고 정제하여 Gemini 모델에 전달하고, AI 기반으로 추가 <br> 필터링 후 클라이언트에 반환하는 기능 개발

### 3. 클라이언트가 이용한 식당 데이터 관리, 식당에 대한 리뷰 쓰기 및 숨기기 기능 구현
- 클라이언트가 이용한 식당 데이터를 가공하여 DB에 기록하는 기능 개발

- JWT 토큰을 통해 사용자 정보를 파싱하고, 이용 내역 테이블에서 일치하는 정보를 <br> 확인 후 리뷰 작성 기능 개발

### 4. 리뷰쓰기에 대한 OCR (사진을 문자로 변환) 기능 구현
- 리뷰를 작성하기 전, 실제 이용한 식당이 맞는지 검증하기 위하여 상호명 혹은 <br> 주소가 보이는 영수증이나 간판 사진을 업로드하게 하여 Python (FastAPI) 서버로 <br> 사진을 보내고, Gemini 모델을 사용해 사진을 분석 후 텍스트 추출

- AI가 이용내역 테이블의 정보와 사진에서 추출된 정보가 일치하는지 판단 후에 <br> 응답하고, 일치해야 리뷰를 작성할 수 있는 기능 개발

- 전체 및 나의 리뷰 조회 기능, 아직 작성하지 않은 리뷰 알림 기능 개발

### 5. Linux기반 홈 네트워크 서버 (Synology Nas)에 Docker환경을 구성하고, 4개의 컨테이너, 1개의 이미지 서버 구축
- 각각의 서비스 (Spring Boot, Python, React, MySQL)를 독립적인 <br> Docker 컨테이너로 구성하여  단일 책임 원칙(SRP)을 준수하는 아키텍처 설계

- 각각의 컨테이너로 구성되어 있어서 유지/보수 및 확장성 용이

### 6. GitHub Actions를 사용하여 각각의 애플리케이션에 대해 CI/CD 파이프라인 구축
- GitHub에 새로운 코드가 push되면 이를 감지하여 배포 자동화 시스템 구축

- 크롤링된 데이터를 필터링하고 정제하여 Gemini 모델에 전달하고, <br> AI 기반으로 추가 필터링 후 클라이언트에 반환하는 기능 개발

<br>
